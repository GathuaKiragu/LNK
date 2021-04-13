package com.tech.social.lnk.ui.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.tech.social.lnk.BuildConfig;
import com.tech.social.lnk.R;
import com.mikepenz.aboutlibraries.LibsBuilder;

/**
 * Created by tech on 29/3/18.
 */

public class About extends Fragment {

    LinearLayout email,website,instagram,google,github,libraries,support;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        email=view.findViewById(R.id.email);
//        website=view.findViewById(R.id.website);
//        instagram=view.findViewById(R.id.instagram);
//        github=view.findViewById(R.id.github);
//        libraries=view.findViewById(R.id.libraries);
//        support=view.findViewById(R.id.support);

//        TextView version=view.findViewById(R.id.version);
//        version.setText(BuildConfig.VERSION_NAME);
//
//        support.setOnClickListener(v -> {
//
//            String url = "https://gathuakiragu.github.io";
//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse(url));
//            startActivity(i);
//
//        });
//
//        libraries.setOnClickListener(v -> {
//
//           new LibsBuilder()
//                    .withAutoDetect(true)
//                    .withActivityTitle("Open Source Libraries")
//                    .withActivityTheme(R.style.AppTheme)
//                    .start(getView().getContext());
//
//        });
//
//        email.setOnClickListener(v -> {
//
//            Intent email = new Intent(Intent.ACTION_SEND);
//            email.putExtra(Intent.EXTRA_EMAIL, new String[]{"kiragugathua@gmail.com"});
//            email.putExtra(Intent.EXTRA_SUBJECT, "Sent from "+Build.BRAND+" "+Build.DEVICE);
//            email.putExtra(Intent.EXTRA_TEXT, "LNK\nversion:"+BuildConfig.VERSION_NAME+"\nandroid version:"+Build.VERSION.CODENAME);
//            email.setType("message/rfc822");
//            startActivity(Intent.createChooser(email, "Select email app"));
//
//        });
//
//        website.setOnClickListener(v -> {
//
//            String url = "";
//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse(url));
//            startActivity(i);
//
//        });
//
//        instagram.setOnClickListener(v -> {
//
//            String url = "https://www.instagram.com/lnk";
//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse(url));
//            startActivity(i);
//
//        });
//
//
//        github.setOnClickListener(v -> {
//
//            String url = "https://github.com/lvamsavarthan/Hify";
//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse(url));
//            startActivity(i);
//
//        });
//
//
    }

}
