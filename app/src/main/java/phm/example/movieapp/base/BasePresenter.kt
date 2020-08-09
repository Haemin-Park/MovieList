package phm.example.movieapp.base

interface BasePresenter<T>{

    fun takeView(view: T)
    fun dropView()
}