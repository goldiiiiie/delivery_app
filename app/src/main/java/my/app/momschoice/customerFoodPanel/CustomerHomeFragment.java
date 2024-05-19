package my.app.momschoice.customerFoodPanel;

//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
//
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import io.reactivex.annotations.NonNull;
//import my.app.momschoice.R;
//import my.app.momschoice.UpdateDishModel;
//
//public class CustomerHomeFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{
//    RecyclerView recyclerView;
//    private List<UpdateDishModel> updateDishModelList;
//    private CustomerHomeAdapter adapter;
//    String State,Area;
//    DatabaseReference dataa,databaseReference;
//    SwipeRefreshLayout swipeRefreshLayout;
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_customerhome, null);
//        getActivity().setTitle("Home");
//        recyclerView = v.findViewById(R.id.recycle_menu);
//        recyclerView.setHasFixedSize(true);
//        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.move);
//        recyclerView.startAnimation(animation);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        updateDishModelList = new ArrayList<>();
//        swipeRefreshLayout = (SwipeRefreshLayout)v.findViewById(R.id.swipelayout);
//        swipeRefreshLayout.setOnRefreshListener(this);
//        swipeRefreshLayout.setColorSchemeResources(R.color.Black,R.color.Coral);
//
//        swipeRefreshLayout.post(new Runnable() {
//            @Override
//            public void run() {
//                swipeRefreshLayout.setRefreshing(true);
//                String  userid = FirebaseAuth.getInstance().getCurrentUser().getUid();
//                dataa = FirebaseDatabase.getInstance().getReference("Customer").child(userid);
//                dataa.addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//
//                        Customer custo = snapshot.getValue(Customer.class);
//                        State = custo.getState();
//                        Area = custo.getArea();
//                        customermenu();
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                });
//            }
//        });
//
//
//        return v;
//    }
//
//    @Override
//    public void onRefresh() {
//        customermenu();
//    }
//
//    private void customermenu() {
//
//        swipeRefreshLayout.setRefreshing(true);
//        databaseReference = FirebaseDatabase.getInstance().getReference("FoodDetails").child(State).child(Area);
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                updateDishModelList.clear();
//                for (DataSnapshot snapshot1 : snapshot.getChildren()){
//                    for(DataSnapshot snapshot2 : snapshot1.getChildren()){
//                        UpdateDishModel updateDishModel = snapshot2.getValue(UpdateDishModel.class);
//                        updateDishModelList.add(updateDishModel);
//                    }
//                }
//                adapter = new CustomerHomeAdapter(getContext(),updateDishModelList);
//                recyclerView.setAdapter(adapter);
//                swipeRefreshLayout.setRefreshing(false);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                swipeRefreshLayout.setRefreshing(false);
//
//            }
//        });
//
//    }
//}

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import my.app.momschoice.chefFoodPanel.UpdateDishModel;
import my.app.momschoice.customerFoodPanel.Customer;

import my.app.momschoice.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CustomerHomeFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener ,CustomerHomeAdapter.OnItemClickListener{



    RecyclerView recyclerView;
    private List<UpdateDishModel> updateDishModelList;
    private CustomerHomeAdapter adapter;
    String State,Area;
    DatabaseReference dataaa, databaseReference;
    SwipeRefreshLayout swipeRefreshLayout;
    SearchView searchView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_customerhome, null);





        getActivity().setTitle("Home");
        setHasOptionsMenu(true);
        recyclerView = v.findViewById(R.id.recycle_menu);
        recyclerView.setHasFixedSize(true);
        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.move);
        recyclerView.startAnimation(animation);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        updateDishModelList = new ArrayList<>();
        swipeRefreshLayout = v.findViewById(R.id.swipelayout);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(R.color.Black, R.color.Green);


        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
                String userid = FirebaseAuth.getInstance().getCurrentUser().getUid();
                dataaa = FirebaseDatabase.getInstance().getReference("Customer").child(userid);
                dataaa.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        Customer cust = dataSnapshot.getValue(Customer.class);
                        if (cust != null) {
                            State = cust.getState();
                            Area = cust.getArea(); // Utilisez getArea() pour récupérer la valeur du champ "Area"
                            // Assurez-vous que Sub est initialisé correctement avant d'appeler customermenu()
                            customermenu();
                        }


                    }


                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });

        return v;
    }


    @Override
    public void onRefresh() {

        customermenu();
    }

    private void customermenu() {

        swipeRefreshLayout.setRefreshing(true);
        databaseReference = FirebaseDatabase.getInstance().getReference("FoodDetails").child(State).child(Area);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                updateDishModelList.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                        UpdateDishModel updateDishModel = snapshot1.getValue(UpdateDishModel.class);
                        updateDishModelList.add(updateDishModel);
                    }
                }
//                adapter = new CustomerHomeAdapter(getContext(), (ArrayList<UpdateDishModel>) updateDishModelList);
//                adapter = new CustomerHomeAdapter(getContext(), (ArrayList<UpdateDishModel>) updateDishModelList, OnItemClickListener);
                adapter = new CustomerHomeAdapter(getContext(), (ArrayList<UpdateDishModel>) updateDishModelList, CustomerHomeFragment.this);


                recyclerView.setAdapter(adapter);
                swipeRefreshLayout.setRefreshing(false);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                swipeRefreshLayout.setRefreshing(false);
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                search(newText);
                return true;
            }
        });

    }

    private void search(final String searchtext) {

        ArrayList<UpdateDishModel> mylist = new ArrayList<>();
        for (UpdateDishModel object : updateDishModelList) {
            if (object.getDishes().toLowerCase().contains(searchtext.toLowerCase())) {
                mylist.add(object);
            }
        }
//        adapter = new CustomerHomeAdapter(getContext(), mylist);
//        adapter = new CustomerHomeAdapter(getContext(), (ArrayList<UpdateDishModel>) updateDishModelList, this);
        recyclerView.setAdapter(adapter);

    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.search, menu);
        MenuItem menuItem = menu.findItem(R.id.Searchdish);
        searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search Dish");


    }


    @Override
    public void onItemClick(UpdateDishModel updateDishModel) {
    // Ouvrir l'activité OrderDish avec les détails du plat sélectionné
        Intent intent = new Intent(getContext(), OrderDish.class);
        intent.putExtra("FoodMenu", updateDishModel.getRandomUID());
        intent.putExtra("ChefId", updateDishModel.getChefId());
        startActivity(intent);
    }
}
