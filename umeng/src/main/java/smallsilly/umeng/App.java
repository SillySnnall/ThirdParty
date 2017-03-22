package smallsilly.umeng;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.common.SocializeConstants;

/**
 * 内容：GC
 * 作者：StringBOX
 * 时间：2017/3/22 15:28
 */

public class App extends Application {
    private String UMENG_KEY = "58d1da3dae1bf86bbf001bfc";
    @Override
    public void onCreate() {
        super.onCreate();
        initUMeng();
        initShare();
    }

    private void initShare() {
        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
    }

    /**
     * 初始化友盟信息
     */
    private void initUMeng() {
        //友盟统计
        MobclickAgent.UMAnalyticsConfig umAnalyticsConfig = new MobclickAgent.UMAnalyticsConfig(
                this, UMENG_KEY, "ThirdParty", MobclickAgent.EScenarioType.E_UM_NORMAL);
        MobclickAgent.startWithConfigure(umAnalyticsConfig);
        // 友盟分享
        SocializeConstants.APPKEY = UMENG_KEY;
    }
}
