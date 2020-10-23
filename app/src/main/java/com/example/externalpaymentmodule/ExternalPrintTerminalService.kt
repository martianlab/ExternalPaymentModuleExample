package com.example.externalpaymentmodule

import ru.usc.android.paymentservice.*

class ExternalPrintTerminalService : UcsPrintService() {

    override suspend fun startPrintFiscalCheck(
        order: String?,
        headers: List<String>?,
        footers: List<String>?
    ): PrintResult {
        /**
         * ... ... Печать фискального чека оплаты
         */
        return PrintComplete
        //return PrintError(500, "Paper not found")
    }

    override suspend fun startPrintRefundCheck(order: String?): PrintResult {
        /**
         * ... ... Печать фискального чека на возврат
         */
        return PrintComplete
        //return PrintError(500, "Paper not found")
    }

    override suspend fun startPrintXReport(): PrintResult {
        /**
         * ... ... Печать X-отчета
         */
        return PrintComplete
        //return PrintError(500, "Paper not found")
    }

    override suspend fun startPrintZReport(): PrintResult {
        /**
         * ... ... Печать Z-отчета
         */
        return PrintComplete
        //return PrintError(500, "Paper not found")
    }
}
