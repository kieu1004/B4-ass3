package com.example.b4ass3;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView showContextMenu = findViewById(R.id.contextMenu);
        registerForContextMenu(showContextMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
        switch (item.getItemId()) {
            case R.id.contextMenuItem1:
                intent.putExtra("msg", "Intermediate");
                startActivity(intent);
                return true;
            case R.id.contextMenuItem2:
                intent.putExtra("msg", "College");
                startActivity(intent);
                return true;
            case R.id.contextMenuItem3:
                intent.putExtra("msg", "University");
                startActivity(intent);
                return true;
            case R.id.contextMenuItem4:
                intent.putExtra("msg", "Postgraduate");
                startActivity(intent);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
        switch (item.getItemId()) {
            case R.id.popupItem1:
                intent.putExtra("msg", "Intermediate");
                startActivity(intent);
                return true;
            case R.id.popupItem2:
                intent.putExtra("msg", "College");
                startActivity(intent);
                return true;
            case R.id.popupItem3:
                intent.putExtra("msg", "University");
                startActivity(intent);
                return true;
            case R.id.popupItem4:
                intent.putExtra("msg", "Postgraduate");
                startActivity(intent);
                return true;
            default:
                return false;
        }
    }

    public void showPopup(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
        switch (item.getItemId()) {
            case R.id.item1:
                intent.putExtra("msg", "Intermediate");
                startActivity(intent);
                return true;
            case R.id.item2:
                intent.putExtra("msg", "College");
                startActivity(intent);
                return true;
            case R.id.item3:
                intent.putExtra("msg", "University");
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}