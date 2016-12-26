package cn.bproject.neteasynews.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.bproject.neteasynews.fragment.BaseFragment;
import cn.bproject.neteasynews.fragment.NewsFragment;

/**
 * Created by Bei on 2016/12/25.
 * 测试空网络链接
 */

public class NewsListFragment2 extends BaseFragment {

    private final String TAG = NewsFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText("NewsListFragment2");
        return textView;
    }
}
