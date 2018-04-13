package com.example.lx.guoyi_chengren.energy;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.example.lx.guoyi_chengren.R;
import com.example.lx.guoyi_chengren.base.BaseFragment;
import com.example.lx.guoyi_chengren.base.MyApp;
import com.example.lx.guoyi_chengren.energy.adapter.EnerListAdapter;
import com.example.lx.guoyi_chengren.energy.bean.Titlte;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lx on 2018/4/12.
 */

public class EnergyFragment extends BaseFragment {

    private View inflate;
    private ListView listview;
    private List<Titlte> listtitle=new ArrayList<Titlte>();
    private EnerListAdapter adapter;

    @Override
    protected void initview() {
    }

    @Override
    protected void initdata() {

        Titlte titltebean=new Titlte();
        titltebean.setTitlte1("正能量");
        titltebean.setTitlte2("点赞诚信 惩处不诚");
        titltebean.setImageview(R.drawable.positive_t);
        listtitle.add(titltebean);
        Titlte titltebean1=new Titlte();
        titltebean1.setTitlte1("评定天下");
        titltebean1.setTitlte2("大众评审团 缺你不可");
        titltebean1.setImageview(R.drawable.world_t);
        listtitle.add(titltebean1);
        Titlte titltebean2=new Titlte();
        titltebean2.setTitlte1("诚信创投");
        titltebean2.setTitlte2("创业 投资 诚信合作");
        titltebean2.setImageview(R.drawable.capital_t);
        listtitle.add(titltebean2);
        Titlte titltebean3=new Titlte();
        titltebean3.setTitlte1("诚天下姻缘");
        titltebean3.setTitlte2("三观相符 情投意合");
        titltebean3.setImageview(R.drawable.marriage_t);
        listtitle.add(titltebean3);
        Titlte titltebean4=new Titlte();
        titltebean4.setTitlte1("诚者 智者 能者");
        titltebean4.setTitlte2("智慧、能力、诚信=高薪职位");
        titltebean4.setImageview(R.drawable.men_t);
        listtitle.add(titltebean4);
        Titlte titltebean5=new Titlte();
        titltebean5.setTitlte1("诚益满满");
        titltebean5.setTitlte2("一方有难 八方支援");
        titltebean5.setImageview(R.drawable.full_t);
        listtitle.add(titltebean5);
        adapter = new EnerListAdapter(getActivity(),listtitle);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected View initlayout() {
        inflate = View.inflate(getActivity(), R.layout.fragment_energy, null);
        listview = inflate.findViewById(R.id.e_listview);
        listview.setAdapter(adapter);
        return inflate;
    }

    @Override
    protected void restartdata() {

    }
}
