package com.kimyasin.agrosaleproject

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class Aromantic : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_aromantic, container, false)


        val  mywebview= view.findViewById(R.id.webview) as WebView
        mywebview.loadUrl("http://www.agrozones.com/product-category/aromatic-plants/?v=0dfea72c735a")

        val webSettings = mywebview.getSettings()
        webSettings.setJavaScriptEnabled(true)

        mywebview.setWebViewClient(WebViewClient())

        return view
    }
}
