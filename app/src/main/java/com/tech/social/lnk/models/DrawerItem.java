package com.tech.social.lnk.models;

import android.view.ViewGroup;

import com.tech.social.lnk.adapters.DrawerAdapter;

/**
 * Created by tech on 29/3/18.
 */


public abstract class DrawerItem<T extends DrawerAdapter.ViewHolder> {

    protected boolean isChecked;

    public abstract T createViewHolder(ViewGroup parent);

    public abstract void bindViewHolder(T holder);

    public boolean isChecked() {
        return isChecked;
    }

    public DrawerItem setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        return this;
    }

    public boolean isSelectable() {
        return true;
    }

}