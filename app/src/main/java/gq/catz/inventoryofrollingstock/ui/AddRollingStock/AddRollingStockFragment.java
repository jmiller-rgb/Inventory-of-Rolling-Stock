package gq.catz.inventoryofrollingstock.ui.AddRollingStock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import gq.catz.inventoryofrollingstock.R;

public class AddRollingStockFragment extends Fragment {

	public View onCreateView(@NonNull LayoutInflater inflater,
	                         ViewGroup container, Bundle savedInstanceState) {

		View root = inflater.inflate(R.layout.fragment_addrollingstock, container, false);
		return root;
	}
}