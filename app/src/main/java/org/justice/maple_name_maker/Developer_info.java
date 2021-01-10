package org.justice.maple_name_maker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Developer_info extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developer_info_activity);

        //블로그 버튼 링크
        Button blog_btn = (Button) findViewById(R.id.blog_btn);
        blog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://haruple.tistory.com/"));
                startActivity(intent);
            }
        });

        //유튜브 버튼 링크
        Button youtube_btn = (Button) findViewById(R.id.youtube_btn);
        youtube_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCI9vrgDbeFdsrQEk-4RWoiA"));
                startActivity(intent);
            }
        });


    }

}
