package Login

import java.lang.Error

interface LoginContract {
    interface View{
        fun showError(msgError: String)
        fun showProgress()
        fun hideProgress()
        fun signIn()
    }
}