package com.dicoding.picodiploma.pahlawanbangsa.adapter;

import com.dicoding.picodiploma.pahlawanbangsa.model.Hero;

interface OnItemClickCallback extends GridHeroAdapter.OnItemClickCallBack {
    void onItemClicked(Hero hero);
}
