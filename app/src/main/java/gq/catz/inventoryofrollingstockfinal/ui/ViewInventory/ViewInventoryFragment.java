package gq.catz.inventoryofrollingstockfinal.ui.ViewInventory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import gq.catz.inventoryofrollingstockfinal.R;

public class ViewInventoryFragment extends Fragment {

	public View onCreateView(@NonNull LayoutInflater inflater,
	                         ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_viewinventory, container, false);

		return root;
	}
}