package com.zed.tools.rule;

import android.view.View;
import android.widget.Button;

import com.zed.tools.BaseActivity;
import com.zed.tools.R;

import butterknife.BindView;

public class RuleActivity extends BaseActivity {
    @BindView(R.id.loop)
    Rule2_1 rule;

    String date = "2018-07-10 14:15:22";
    int time = 7;

    @Override
    protected int getLayout() {
        return R.layout.activity_rule;
    }

    @Override
    protected void onViewCreate() {
    }

    public void change(View view) {
        rule.setLoop(!rule.isLoop());
        ((Button) view).setText(String.valueOf(rule.isLoop()));
    }

}
