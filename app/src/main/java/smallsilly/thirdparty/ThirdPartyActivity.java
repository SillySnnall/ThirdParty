package smallsilly.thirdparty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.View;

import smallsilly.umeng.UmengActivity;

public class ThirdPartyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_party);
        // 侵入式状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        initEvent();

    }

    private void initEvent() {
        findViewById(R.id.umeng).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdPartyActivity.this, UmengActivity.class));
            }
        });
    }
}
