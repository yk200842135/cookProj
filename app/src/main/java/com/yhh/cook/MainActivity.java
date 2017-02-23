package com.yhh.cook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText(Html.fromHtml( "<h2>菜谱简介</h2><hr>   水煮肉片是四川传统名菜,因肉片未经划油,以水煮熟故名水煮肉片，是水煮鱼的衍生菜。   <h2>材料 </h2><hr> <p>肉片300克，大白菜500克，油、葱、姜、蒜、干辣椒、料酒、淀粉、盐、鸡精、水煮肉调料适量。</p>   <h2>做法 </h2><hr> <p>1、瘦猪肉300克洗净切片，大白菜切块焯水，葱姜蒜洗净切好待用。 </p> <p>2、用料酒、淀粉把肉片抓匀。 </p> <p>3、起锅热油爆香葱姜蒜，翻炒水煮肉调料。 </p> <p>4、倒入1碗清水，烧约5分钟，放盐和鸡精调味。 </p> <p>5、锅开将肉片一一放入锅中，煮约3分钟。 </p> <p>6、肉片断生，撒上葱花和干辣椒淋上热油即可。</p>   <h2>小诀窍</h2><hr> <p>最好到超市买水煮肉或水煮鱼调料，省事方便好吃。用郫县豆瓣酱和五香粉做水煮肉也可以。</p><p>最好到超市买水煮肉或水煮鱼调料，省事方便好吃。用郫县豆瓣酱和五香粉做水煮肉也可以。</p><p>最好到超市买水煮肉或水煮鱼调料，省事方便好吃。用郫县豆瓣酱和五香粉做水煮肉也可以。</p><p>最好到超市买水煮肉或水煮鱼调料，省事方便好吃。用郫县豆瓣酱和五香粉做水煮肉也可以。</p>"));
    }
}
