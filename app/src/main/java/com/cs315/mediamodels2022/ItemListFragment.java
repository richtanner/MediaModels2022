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


    // I am setting up my model creator... again this is called "movieMaker" only because I am doing movies!  Call yours whatever makes sense!
    //private static AnthonyMediaContent displayMaker = new AnthonyMediaContent();
    private static AnthonyMediaContent displayMaker;
    // CS315: DO THIS
    // TODO: After you create your OWN Model Creator, DELETE the reference to "ProfsExampleMediaContent" above and call your own!


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

        displayMaker = new AnthonyMediaContent();
        // CS315: I am calling MY Media Creator and having it populate with the line below... obviously, change that out to YOUR thing
        displayMaker.generateCiv();
        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(
                // TODO: After you create your OWN Model Creator, DELETE the reference to "movieMaker.MOVIES" below and call your own!
                displayMaker.CONTENT,
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

        private List<MediaModel> mediaValues;
        private final View mItemDetailFragmentContainer;

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
            });
        }

        @Override
        public int getItemCount() {
            // CS315: DO THIS
            // TODO: BUG FIX - Figure out why our movie list gets re-added every time we come back to this Activity
            // TODO: it could be in THIS class, OR in the DumbMovieContent class, or maybe even somewhere else?
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