package com.app.buscameapi.robots

import com.app.buscameapi.dto.ProductDto

class ProductSearchRobot(override val API_KEY: String, override val SERVICE_URL: String) : IProductSearchRobot {

    override fun authenticate() {
        TODO("Implementar autenticação")
    }

    override fun search(text: String,params: Map<String, String?>) : List<ProductDto>{
        TODO("Implementar Busca por Imagem")

        return emptyList()
    }
}