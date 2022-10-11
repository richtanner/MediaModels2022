package com.cs315.mediamodels2022;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;

import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.cs315.mediamodels2022.databinding.FragmentItemListBinding;
import com.cs315.mediamodels2022.databinding.ItemListContentBinding;

import java.util.List;

/**
 * A fragment representing a list of Items. This fragment
 * has different presentations for handset and larger screen devices. On
 * handsets, the fragment presents a list of items, which when touched,
 * lead to a {@link ItemDetailFragment} representing
 * item details. On larger screens, the Navigation controller presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class ItemListFragment extends Fragment {

    private FragmentItemListBinding binding;

    private boolean setUpRecyclerView = false;

    // I am setting up my model creator... again this is called "movieMaker" only because I am doing movies!  Call yours whatever makes sense!
    private static DavisMediaContent movieMaker = new DavisMediaContent();
    // CS315: DO THIS
    // After you create your OWN Model Creator, DELETE the reference to "ProfsExampleMediaContent" above and call your own!


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentItemListBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = binding.itemList;

        // Leaving this not using view binding as it relies on if the view is visible the current
        // layout configuration (layout, layout-sw600dp)
        View itemDetailFragmentContainer = view.findViewById(R.id.item_detail_nav_container);

        setupRecyclerView(recyclerView, itemDetailFragmentContainer);
    }

    private void setupRecyclerView(
            RecyclerView recyclerView,
            View itemDetailFragmentContainer
    ) {

        //if(setUpRecyclerView == false){
        //    setUpRecyclerView = true;
        //    movieMaker.createMovieMagic();
        // }

        // CS315: I am calling MY Media Creator and having it populate with the line below... obviously, change that out to YOUR thing
        movieMaker.createMovieMagic();
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(
                // After you create your OWN Model Creator, DELETE the reference to "movieMaker.MOVIES" below and call your own!
                movieMaker.SCHMOVIES,
                //movieMaker.MOVIES,
                itemDetailFragmentContainer
        ));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public static class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final List<MediaModel> mediaValues;
        private final View mItemDetailFragmentContainer;

        public void clear() {
            int size = mediaValues.size();
            mediaValues.clear();
            notifyItemRangeRemoved(0, size);
        }

        SimpleItemRecyclerViewAdapter(List<MediaModel> items,
                                      View itemDetailFragmentContainer) {
            mediaValues = items;
            mItemDetailFragmentContainer = itemDetailFragmentContainer;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            ItemListContentBinding binding =
                    ItemListContentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            return new ViewHolder(binding);

        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            holder.mediaItem = mediaValues.get(position);
            holder.mIdView.setText(mediaValues.get(position).getMediaTitle());
            holder.mContentView.setText(mediaValues.get(position).getMediaYear());

            holder.itemView.setTag(mediaValues.get(position));
            holder.itemView.setOnClickListener(itemView -> {
                Bundle arguments = new Bundle();
                arguments.putString(ItemDetailFragment.ARG_ITEM_ID, mediaValues.get(position).getMediaTitle());
                if (mItemDetailFragmentContainer != null) {
                    Navigation.findNavController(mItemDetailFragmentContainer)
                            .navigate(R.id.fragment_item_detail, arguments);
                } else {
                    Navigation.findNavController(itemView).navigate(R.id.show_item_detail, arguments);
                }
                clear();
            });
        }

        @Override
        public int getItemCount() {
            // CS315: DO THIS
            return mediaValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView mIdView;
            final TextView mContentView;
            public MediaModel mediaItem;

            ViewHolder(ItemListContentBinding binding) {
                super(binding.getRoot());
                mIdView = binding.idText;
                mContentView = binding.content;
            }

        }
    }
}