package com.github.bigexcalibur.herovideo.adapter.section;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.bigexcalibur.herovideo.R;
import com.github.bigexcalibur.herovideo.ui.widget.banner.BannerEntity;
import com.github.bigexcalibur.herovideo.ui.widget.banner.BannerView;
import com.github.bigexcalibur.herovideo.ui.widget.sectioned.StatelessSection;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 首页番剧界面轮播图Section
 */
public class HomeBangumiBannerSection extends StatelessSection
{

    private List<BannerEntity> banners;

    public HomeBangumiBannerSection(List<BannerEntity> banners)
    {

        super(R.layout.layout_banner, R.layout.layout_home_recommend_empty);
        this.banners = banners;
    }

    @Override
    public int getContentItemsTotal()
    {

        return 1;
    }

    @Override
    public RecyclerView.ViewHolder getItemViewHolder(View view)
    {

        return new EmptyViewHolder(view);
    }

    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position)
    {

    }


    @Override
    public RecyclerView.ViewHolder getHeaderViewHolder(View view)
    {

        return new BannerViewHolder(view);
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder)
    {

        BannerViewHolder bannerViewHolder = (BannerViewHolder) holder;
        bannerViewHolder.mBannerView.delayTime(5).build(banners);
    }


    static class EmptyViewHolder extends RecyclerView.ViewHolder
    {

        EmptyViewHolder(View itemView)
        {

            super(itemView);
        }
    }


    static class BannerViewHolder extends RecyclerView.ViewHolder
    {

        @BindView(R.id.home_recommended_banner)
        BannerView mBannerView;

        BannerViewHolder(View itemView)
        {

            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
