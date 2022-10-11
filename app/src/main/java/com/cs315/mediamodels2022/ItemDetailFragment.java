package com.cs315.mediamodels2022;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.cs315.mediamodels2022.databinding.FragmentItemDetailBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListFragment}
 * in two-pane mode (on larger screen devices) or self-contained
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {

    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     *
     * We used the MediaTitle as our ID.
     */
    public static final String ARG_ITEM_ID = "item_id";
    public static final String URLSENDEY = "https://isitchristmas.com/";

    /**
     * The Movie content this fragment is presenting.
     */
    private MediaModel mediaItem;

    private CollapsingToolbarLayout mToolbarLayout;
    private TextView mediaDetailTextView;
    private ImageView mediaImageView;
    private FloatingActionButton mediaFab;

    private final View.OnDragListener dragListener = (v, event) -> {
        if (event.getAction() == DragEvent.ACTION_DROP) {
            ClipData.Item clipDataItem = event.getClipData().getItemAt(0);
            mediaItem = ProfsExampleMediaContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
            updateContent();
        }
        return true;
    };
    private FragmentItemDetailBinding binding;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the MEDIA content specified by the fragment arguments.
            mediaItem = ProfsExampleMediaContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            // maybe set the title here?
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentItemDetailBinding.inflate(inflater, container, false);
        View rootView = binding.getRoot();

        mToolbarLayout = rootView.findViewById(R.id.toolbar_layout);
        mediaDetailTextView = binding.itemDetail;
        mediaImageView = rootView.findViewById(R.id.media_imageView);
        mediaFab = rootView.findViewById(R.id.fab);

        // Show the placeholder content as text in a TextView & in the toolbar if available.
        updateContent();
        rootView.setOnDragListener(dragListener);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void updateContent()
    {
        if (mediaItem != null)
        {
            mediaDetailTextView.setText(mediaItem.getMediaDescription());

            if (mToolbarLayout != null)
            {
                mToolbarLayout.setTitle(mediaItem.getMediaTitle());
            }

            if (mediaImageView != null)
            {

                String imageName = mediaItem.getMediaImage();
                //fix this
                int imageId = getResources().getIdentifier(mediaItem.getMediaImage(), "drawable", getContext().getPackageName());
                mediaImageView.setImageResource(imageId);

            }

            if (mediaFab != null)
            {
                mediaFab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Snackbar.make(view, "Loading web link", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();

                        Intent intent = new Intent(ItemDetailFragment.super.getActivity(), WebActivity.class);
                        String url = mediaItem.getMediaWeblink();
                        intent.putExtra(URLSENDEY, url);
                        startActivity(intent);
                    }
                });
            }
        }
    }
}