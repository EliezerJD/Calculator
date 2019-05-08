package app.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    String num1 = "";
    String indice = "";
    String operacion = "";
    double result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void listener( View view ) {
        final TextView resultado = findViewById(R.id.resultado);
        switch (view.getId()) {
            case (R.id.n0):
                indice = indice +"0";
                resultado.setText(indice);
                break;
            case (R.id.n1):
                indice = indice +"1";
                resultado.setText(indice);
                break;
            case (R.id.n2):
                indice = indice +"2";
                resultado.setText(indice);
                break;
            case (R.id.n3):
                indice = indice +"3";
                resultado.setText(indice);
                break;
            case (R.id.n4):
                indice = indice +"4";
                resultado.setText(indice);
                break;
            case (R.id.n5):
                indice = indice +"5";
                resultado.setText(indice);
                break;
            case (R.id.n6):
                indice = indice +"6";
                resultado.setText(indice);
                break;
            case (R.id.n7):
                indice = indice +"7";
                resultado.setText(indice);
                break;
            case (R.id.n8):
                indice = indice +"8";
                resultado.setText(indice);
                break;
            case (R.id.n9):
                indice = indice +"9";
                resultado.setText(indice);
                break;
            case (R.id.punto):
                indice = indice +".";
                resultado.setText(indice);
                break;
        }
    }


    public void list_operador(View view) {
        final TextView resultado = findViewById(R.id.resultado);
        switch (view.getId()) {
            case (R.id.mas):
                if(result == 0){
                    num1 = indice;
                }else{
                    num1 = String.valueOf(result);
                }
                indice = "";
                operacion = "suma";
                break;
            case (R.id.menos):
                if(result == 0){
                    num1 = indice;
                }else{
                    num1 = String.valueOf(result);
                }
                indice = "";
                operacion = "resta";
                break;
            case (R.id.por):
                if(result == 0){
                    num1 = indice;
                }else{
                    num1 = String.valueOf(result);
                }
                indice = "";
                operacion = "mult";
                break;
            case (R.id.div):
                if(result == 0){
                    num1 = indice;
                }else{
                    num1 = String.valueOf(result);
                }
                indice = "";
                operacion = "div";
                break;
            case (R.id.c):
                indice = "";
                result= 0;
                resultado.setText("0");
                break;
            case (R.id.mod):
                if(result == 0){
                    num1 = indice;
                }else{
                    num1 = String.valueOf(result);
                }
                indice = "";
                operacion = "porcentaje";
                break;
            case (R.id.elev):
                if(result == 0){
                    num1 = indice;
                }else{
                    num1 = String.valueOf(result);
                }
                indice = "";
                operacion = "elev";
                break;
        }
    }

    public void list_resultado(View view) {
        switch (operacion){
            case "suma":
                result = Double.parseDouble(num1) + Double.parseDouble(indice);
                formato(result);
                break;
            case "resta":
                result = Double.parseDouble(num1) - Double.parseDouble(indice);
                formato(result);
                break;
            case "mult":
                result = Double.parseDouble(num1) * Double.parseDouble(indice);
                formato(result);
                break;
            case "div":
                result = Double.parseDouble(num1) / Double.parseDouble(indice);
                formato(result);
                break;
            case "porcentaje":
                result = (Double.parseDouble(num1) * Double.parseDouble(indice)) / 100;
                formato(result);
                break;
            case "elev":
                result = Math.pow(Double.parseDouble(num1), Double.parseDouble(indice));
                formato(result);
                break;
        }

    }

    public void formato(double d) {
        final TextView resultado = findViewById(R.id.resultado);
        DecimalFormat nf = new DecimalFormat("##.###");
        resultado.setText( nf.format(d) );
    }
}
