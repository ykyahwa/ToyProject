package com.ykyahwa.sns;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.kakao.kakaolink.KakaoLink;
import com.kakao.kakaolink.KakaoTalkLinkMessageBuilder;
import com.kakao.util.KakaoParameterException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * https://developers.kakao.com/docs/android
 * http://blog.naver.com/bdh0727/220608443620
 kakao_strings.xml 에 kakao_app_key, kakao_scheme 값으로 카카오톡에서 발급받은 App Key등록해야한다.

 * Created by ehlee on 2016-03-31.
 */
public class KakaoTalkFragment extends Fragment{

    @Bind(R.id.et_kakao_message)EditText message;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kakaotalk, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.bt_kakao_send)
    public void clickSend(View view) {
        String message = this.message.getText().toString();
//        Toast.makeText(getContext(), message.getText().toString(), Toast.LENGTH_LONG).show();
        try {
            final KakaoLink kakaoLink = KakaoLink.getKakaoLink(getActivity().getApplicationContext());
            final KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();
            kakaoTalkLinkMessageBuilder.addText(message);

            kakaoLink.sendMessage(kakaoTalkLinkMessageBuilder, getContext());
        } catch (KakaoParameterException e) {
            e.printStackTrace();
        }
    }
}
