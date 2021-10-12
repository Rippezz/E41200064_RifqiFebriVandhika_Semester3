package com.example.fragment_bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
// program dengan bahasa java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // memanggil apa yang sudah dibuat dalam acvitity_main.xml
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mengambil toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // memanggil gambar layout yang sudah dibuat menggunakan navigation view
        drawer = findViewById(R.id.gambar_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // membuka dan menutup navigasi dengan toggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // memberi aksi pilih untuk item pada navigasi
        switch (item.getItemId()) {
            case R.id.nav_tulispesan:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contain,
                        new Fragmenttulispesan()).commit();
                break;
            case R.id.nav_percakapan:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contain,
                        new Fragmentpercakapan()).commit();
                break;
            case R.id.nav_permainan:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contain,
                        new Fragmentpermainan()).commit();
                break;
            case R.id.nav_kirim:
                Toast.makeText(this, "Kirim", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_bagikan:
                Toast.makeText(this, "Bagikan", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
        @Override
        public void onBackPressed () {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
    }
