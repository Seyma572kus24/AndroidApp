package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculatorapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
private  float valueOne,valuTwo;
    private boolean plus,minus,div,multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);




         binding.buttonOne.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"1");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonTwo.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"2");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonThree.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"3");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonFour.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"4");
            binding.solution.setText(binding.result.getText());
        });
            binding.buttonFive.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"5");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonSix.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"6");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonSeven.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"7");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonEight.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"8");
            binding.solution.setText(binding.result.getText());
        });
            binding.buttonNine.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"9");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonZero.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+"0");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonDot.setOnClickListener(view1 -> {
            binding.result.setText(binding.result.getText()+".");
            binding.solution.setText(binding.result.getText());
        });
        binding.buttonAC.setOnClickListener(view1 -> {
            binding.result.setText("");
        });
        binding.buttonPlus.setOnClickListener(view1 ->{
            if (binding.result==null){
                binding.result.setText("");
            }else {
                valueOne=Float.parseFloat(binding.result.getText()+"");
             plus=true;
             binding.result.setText(null);
            }
        } );
        binding.buttonMinus.setOnClickListener(view1 ->{
            if (binding.result==null){
                binding.result.setText("");
            }else {
                valueOne=Float.parseFloat(binding.result.getText()+"");
                minus=true;
                binding.result.setText(null);
            }
        } );
        binding.buttonMulti.setOnClickListener(view1 ->{
            if (binding.result==null){
                binding.result.setText("");
            }else {
                valueOne=Float.parseFloat(binding.result.getText()+"");
                multi =true;
                binding.result.setText(null);
            }
        } );
        binding.buttonDiv.setOnClickListener(view1 ->{
            if (binding.result==null){
                binding.result.setText("");
            }else {
                 valueOne=Float.parseFloat(binding.result.getText()+"");
                div =true;
                binding.result.setText(null);
            }
        } );
        binding.buttonEqual.setOnClickListener(view1 ->{
             valuTwo=Float.parseFloat(binding.result.getText()+"");
             if (plus==true){
                 binding.result.setText(valueOne+valuTwo+"");
                 binding.solution.setText(valueOne+"+"+valuTwo);
                 plus=false;
            }
             if (minus==true){
                 binding.result.setText(valueOne-valuTwo+"");
                 binding.solution.setText(valueOne+"-"+valuTwo);
                 minus=false;
             }
             if (multi==true){
                 binding.result.setText(valueOne*valuTwo+"");
                 binding.solution.setText(valueOne+"*"+valuTwo);
                 multi=false;
             }if (div==true){
                binding.result.setText(valueOne/valuTwo+"");
                binding.solution.setText(valueOne+"/"+valuTwo);
                div=false;}
        } );



    }
}