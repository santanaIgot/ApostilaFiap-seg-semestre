class Inventario:
    def __init__(self,preco,qtd,dep):
        self.preco=preco
        self.qtd = qtd
        self.dep=dep
    
    def depreciar(self):
        self.preco = self.preco*0.9

    def get_preco(self):
        return self.preco
    
    



    
if __name__ == "__main__":
    inventario1 = Inventario(500,2,"pessoal")
    print("Preço:",inventario1.preco,"qtd:",inventario1.qtd,"dEp:",inventario1.dep)
    inventario1.depreciar()