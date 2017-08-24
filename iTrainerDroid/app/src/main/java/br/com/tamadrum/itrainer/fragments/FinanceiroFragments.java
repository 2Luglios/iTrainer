package br.com.tamadrum.itrainer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.concurrent.ExecutionException;

import br.com.tamadrum.itrainer.R;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.CieloEcommerce;
import cieloecommerce.sdk.ecommerce.Customer;
import cieloecommerce.sdk.ecommerce.Environment;
import cieloecommerce.sdk.ecommerce.Payment;
import cieloecommerce.sdk.ecommerce.Sale;
import cieloecommerce.sdk.ecommerce.request.CieloError;
import cieloecommerce.sdk.ecommerce.request.CieloRequestException;

/**
 * Created by ettoreluglio on 20/08/17.
 */

public class FinanceiroFragments extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_financeiro_layout, null);

//        // Configure seu merchant
//        Merchant merchant = new Merchant("d977e3d5-bb9a-46ad-b925-a299a4828494", "HUZFQLSSIOPEXXSBJSSPLXMDPTMUTUTPTGYYFWTG");
//
//        // Crie uma instância de Sale informando o ID do pagamento
//        Sale sale = new Sale("ID do pagamento");
//
//        // Crie uma instância de Customer informando o nome do cliente
//        Customer customer = sale.customer("Comprador Teste");
//
//        // Crie uma instância de Payment informando o valor do pagamento
//        Payment payment = sale.payment(15700);
//
//        // Crie  uma instância de Credit Card utilizando os dados de teste
//        // esses dados estão disponíveis no manual de integração
//        payment.creditCard("123", "Visa").setExpirationDate("12/2018")
//                .setCardNumber("0000000000000001").setHolder("Fulano de Tal");
//
//        // Crie o pagamento na Cielo
//        try {
//            // Configure o SDK com seu merchant e o ambiente apropriado para criar a venda
//            sale = new CieloEcommerce(merchant, Environment.SANDBOX).createSale(sale);
//
//            // Com a venda criada na Cielo, já temos o ID do pagamento, TID e demais
//            // dados retornados pela Cielo
//            String paymentId = sale.getPayment().getPaymentId();
//
//            // Com o ID do pagamento, podemos fazer sua captura, se ela não tiver sido capturada ainda
//            new CieloEcommerce(merchant, Environment.SANDBOX).captureSale(paymentId, 15700, 0);
//
//            // E também podemos fazer seu cancelamento, se for o caso
//            new CieloEcommerce(merchant, Environment.SANDBOX).cancelSale(paymentId, 15700);
//        } catch (ExecutionException | InterruptedException e) {
//            // Como se trata de uma AsyncTask, será preciso tratar ExecutionException e InterruptedException
//            e.printStackTrace();
//        } catch (CieloRequestException e) {
//            // Em caso de erros de integração, podemos tratar o erro aqui.
//            // os códigos de erro estão todos disponíveis no manual de integração.
//            CieloError error = e.getError();
//
//            Log.v("Cielo", error.getCode().toString());
//            Log.v("Cielo", error.getMessage());
//
//            if (error.getCode() != 404) {
//                Log.e("Cielo", null, e);
//            }
//        }
//

        return v;
    }
}
