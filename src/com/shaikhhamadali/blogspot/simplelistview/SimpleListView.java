package com.shaikhhamadali.blogspot.simplelistview;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SimpleListView extends Activity {
	//Array of Week 
	String[] weeks={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_list_view);

	}
	/**
	 * This method will be called on List from Array button click
	 * @param View
	 * */
	public void fromArray(View v){
		//get reference of list view
		final ListView lv=(ListView)findViewById(R.id.listView1);
		/*create an array adapter and set simple layout
		 * of single text view and pass an array of week described above
		 */
		ArrayAdapter<String> adpt=new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,weeks);
		//set this adapter to listview
		lv.setAdapter(adpt);
	}
	/**
	 * This method will be called on List from Strings.xml button click
	 * @param View
	 * */

	public void fromStringsArray(View v){
		//get reference of list view
		final ListView lv=(ListView)findViewById(R.id.listView1);
		/*create an array adapter and set simple layout
		 * of single text view and pass an array from strings.xml file
		 */
		ArrayAdapter<String> adpt=new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.months));
		//set this adapter to listview
		lv.setAdapter(adpt);
	}


}
