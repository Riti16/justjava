package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage=(quantity*5)+"$ for "+quantity+" cups of coffee. Pay up.";
        priceMessage=priceMessage+"\nGosh, what a polite and humble fellow! I sincerely thank your welcoming presence for being here today.!\n................\nThank you once again, my good friend.";
        displayMessage(priceMessage);
    }


    public void termsandconditions(View view){
        String message="(1)You can order coffee only in positive whole numbers.\n(2)Once you have submitted the order, it can't be cancelled.\n(3)For any queries, contact the employee at the counter.\n(4) Make sure that you do not try to trouble the Barista by any chance. He is always busy preparing the best coffee for you;)\n(5)Be a sane and disciplined customer. By this, we strictly mean that we do not accept irrational and insane orders.\n(6)For further queries, do not bother us.";
        message=message+"\nIf it wasn't for you, well................ thanks for nothing.";
        displayMessage(message);
    }
    /**


     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increment(View view){
        quantity=quantity+1;
        display(quantity);
    }

    public void decrement(View view){
        quantity=quantity-1;
        display(quantity);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
