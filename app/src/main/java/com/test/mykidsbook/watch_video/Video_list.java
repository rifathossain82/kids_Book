package com.test.mykidsbook.watch_video;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import com.test.mykidsbook.R;

public class Video_list extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    String[] countryName;
    int[] flag={R.drawable.vv1,R.drawable.vv2,R.drawable.vv3,R.drawable.vv4,R.drawable.vv5,R.drawable.vv6,R.drawable.vv8,R.drawable.vv9
    ,R.drawable.vv11,R.drawable.vv13,R.drawable.vv14,R.drawable.vv15};
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video_list);

        listView=(ListView)findViewById(R.id.listviewID);
        this.setTitle("Country Profile");

        countryName=getResources().getStringArray(R.array.country_name);

        adapter=new CustomAdapter(this,countryName,flag);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
           Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Bangla%20Sorborno%20_%20%E0%A6%AC%E0%A6%B0%E0%A7%8D%E0%A6%A3%E0%A6%AE%E0%A6%BE%E0%A6%B2%E0%A6%BE%20-%20%E0%A6%85%20%E0%A6%86%20_%20Bangla%20Bornomala%20_%20Bangla%20Cartoon%20_%20Bangla%20Rh.mp4?alt=media&token=119b1be8-96c3-4bde-b75b-cb71e3f07eda");
            startActivity(it);
        }
        else if(position==1){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Banjonborno%20song%20_%20%E0%A6%AC%E0%A7%8D%E0%A6%AF%E0%A6%9E%E0%A7%8D%E0%A6%9C%E0%A6%A8%E0%A6%AC%E0%A6%B0%E0%A7%8D%E0%A6%A3%20-%E0%A6%95%20%E0%A6%96%20_%20Bangla%20Bornomala%20_%20Bangla%20Rhymes%20for%20Child.mp4?alt=media&token=e053c09d-1200-497d-8866-2262d9374dfb");
            startActivity(it);
        }
        else if(position==2){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Ek%20Dui%20Tin%20_%20%E0%A6%8F%E0%A6%95%20%E0%A6%A6%E0%A7%81%E0%A6%87%20%E0%A6%A4%E0%A6%BF%E0%A6%A8%20%E0%A6%9A%E0%A6%BE%E0%A6%B0%20_%20Bangla%20Numbers%20_%20Bangla%20Cartoon%20_%20Bengali%20Cartoon%20_%20Kheyal%20Khushi.mp4?alt=media&token=2551f0c4-c971-4c06-b0e1-c4e9f11dc3c6");
            startActivity(it);
        }
        else if(position==3){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Phonics%20Song%20with%20TWO%20Words%20-%20A%20For%20Apple%20-%20ABC%20Alphabet%20Songs%20with%20Sounds%20for%20C.mp4?alt=media&token=c1403e79-0504-4aee-bc37-db456659f7df");
            startActivity(it);
        }
        else if(position==4){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Number%20Song%20_%20Nursery%20Rhymes%20For%20Children%20_%20Preschool%20rhyme.mp4?alt=media&token=5c252cd8-a51a-4274-a09c-7089f2922642");
            startActivity(it);
        }
        if(position==5){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Oi%20ojogor%20asche%20tere%20_%20Aye%20ajagar%20_%20%E0%A6%85'%E0%A6%AF%E0%A6%BC%20%E0%A6%85%E0%A6%9C%E0%A6%97%E0%A6%B0%20%E0%A6%86%E0%A6%B8%E0%A6%9B%E0%A7%87%20%E0%A6%A4%E0%A7%87%E0%A6%A1%E0%A6%BC%E0%A7%87%20_%20Bangla%20Cartoon%20_%20Kheyal%20Khushi.mp4?alt=media&token=19ce74d4-6f91-47cb-9b3a-5d14de2e7a38");
            startActivity(it);
        }
        else if(position==6){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/%E0%A6%96%E0%A7%8B%E0%A6%95%E0%A6%BE%20%E0%A6%AF%E0%A6%BE%E0%A6%AC%E0%A7%87%20%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%B6%E0%A7%81%E0%A6%B0%20%E0%A6%AC%E0%A6%BE%E0%A7%9C%E0%A6%BF%20Khoka%20jabe%20soshur%20bari%20_%20Popular%20Bengali%20Nursery%20Rhymes.mp4?alt=media&token=d738825b-78c8-44c4-83f1-01e60da457ab");
            startActivity(it);
        }
        else if(position==7){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Aye%20Aye%20Chand%20Mama%20_%20%E0%A6%86%E0%A6%AF%E0%A6%BC%20%E0%A6%86%E0%A6%AF%E0%A6%BC%20%E0%A6%9A%E0%A6%BE%E0%A6%81%E0%A6%A6%20%E0%A6%AE%E0%A6%BE%E0%A6%AE%E0%A6%BE%20_%20Ai%20Ai%20Chand%20_%20Bengali%20Cartoon_%20Bengali%20.mp4?alt=media&token=190d202f-9139-4596-a9eb-c2f3db4b5c96");
            startActivity(it);
        }
        if(position==8){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Johny%20Johny%20Yes%20Papa%20%F0%9F%91%B6%20THE%20BEST%20Song%20for%20Children%20_%20LooLoo%20Kids.mp4?alt=media&token=19222cb3-54f3-45cd-a78b-d38af16e9f00");
            startActivity(it);
        }
        else if(position==9){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/%E0%A6%B8%E0%A6%BE%E0%A6%AA%E0%A7%87%E0%A6%B0%20%E0%A6%B8%E0%A6%BE%E0%A6%A5%E0%A7%87%20%E0%A6%AC%E0%A6%BF%E0%A6%AF%E0%A6%BC%E0%A7%87%20_%20Marriage%20with%20Snake%E2%80%99s%20story%20_%20Original%20Bengali%20Stories%20_%20Mora%20(1).mp4?alt=media&token=51ca79b6-1f69-4154-b3b5-937c5647240c");
            startActivity(it);
        }
        else if(position==10){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/%E0%A6%9A%E0%A6%BE%E0%A6%B2%E0%A6%BE%E0%A6%95%20%E0%A6%B6%E0%A6%BF%E0%A7%9F%E0%A6%BE%E0%A6%B2%20%E0%A6%93%20%E0%A6%AC%E0%A7%8B%E0%A6%95%E0%A6%BE%20%E0%A6%95%E0%A7%81%E0%A6%AE%E0%A6%BF%E0%A6%B0%E0%A7%87%E0%A6%B0%20%E0%A6%9A%E0%A6%BE%E0%A6%B7%E0%A6%AC%E0%A6%BE%E0%A6%B8%20_%20Clever%20Fox%20and%20Foolish%20Crocodile%20Story%20_%20%E0%A6%9A%E0%A6%BE%E0%A6%81.mp4?alt=media&token=ebe15fc0-e748-484f-9852-b4c04e6665bb");
            startActivity(it);
        }
        else if(position==11){
            Intent it=new Intent(Video_list.this,WatchVideo.class);
            it.putExtra("link","https://firebasestorage.googleapis.com/v0/b/my-kids-book.appspot.com/o/Bengali%20Story%20_%20%E0%A6%B8%E0%A6%B2%E0%A6%BF%E0%A6%9F%E0%A6%BE%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%B0%20%E0%A6%97%E0%A6%BE%E0%A6%9B%20_%20Bengali%20Fairy%20Tales%20%23THAKURMARJHULI%20%23StoryToonsT.mp4?alt=media&token=5b615593-139e-4473-9506-580a28a5948e");
            startActivity(it);
        }
    }
}