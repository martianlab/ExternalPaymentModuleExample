package com.example.externalpaymentmodule

import ru.usc.android.paymentservice.PaymentResult
import ru.usc.android.paymentservice.TransactionComplete
import ru.usc.android.paymentservice.TransactionError
import ru.usc.android.paymentservice.UcsPosService

class ExternalPosTerminalService : UcsPosService() {

    override suspend fun startPayment(amount: String?): PaymentResult {
        /**
         * ... ... Оплата POS терминалом
         */
        return TransactionComplete("ReturnTransactionId")
        //return TransactionError(404, "Not enough money")
    }

    override suspend fun startRefund(amount: String?): PaymentResult {
        /**
         * ... ... Возврат оплаты POS терминалом
         */
        return TransactionComplete("ReturnTransactionId")
        //return TransactionError(404, "Not enough money")
    }
}
