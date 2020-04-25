package com.appsnipp.webviewsample;

import android.app.Dialog;
import android.content.Context;
import android.view.View;



/**
 * Created by kapil on 03/11/18.
 */

public class Df {
    private Context context;

    public Df(){

    }
    public Df(Context context){
        this.context = context;
    }

    public void showNoInternetDialog(){
        final Dialog dialog1 = new Dialog(context, R.style.df_dialog);
        dialog1.setContentView(R.layout.dialog_no_internet);
        dialog1.setCancelable(true);
        dialog1.setCanceledOnTouchOutside(true);
        dialog1.findViewById(R.id.btnSpinAndWinRedeem).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
            }
        });
        dialog1.show();


    }

}
