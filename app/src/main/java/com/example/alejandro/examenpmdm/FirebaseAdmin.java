package com.example.alejandro.examenpmdm;

/**
 * Created by alejandro on 19/2/18.
 */
import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class FirebaseAdmin {
    private FirebaseAuth mAuth;
    public FirebaseAdminListener listener;

    public FirebaseAdmin(){
        mAuth = FirebaseAuth.getInstance();
    }

    public void setListener(FirebaseAdminListener listener){
        this.listener=listener;
    }

    public void loginConEmailYPassword(String email, String pass, Activity activity){
        mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("FirebaseAdmin", "createUserWithEmail:onComplete:" + task.isSuccessful());

                        if (task.isSuccessful()) {

                        }else {

                        }
                    }
                });
    }
}
