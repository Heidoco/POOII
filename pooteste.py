class Animal:
    def __init__(self, nome):
        self.nome = nome
        
    def emitir_som(self):
        pass
    
    def comer(self, comida):
        return f"{self.nome} está comendo {comida}!"
    
class Ave(Animal):
    def voar(self):
        return f"{self.nome} está voando!"
    
    def construir_ninho(self):
        return f"{self.nome} está construindo um ninho."
    
class Inseto(Animal):
    def voar(self):
        return f"{self.nome} está voando zumbindo!"
    
    def polinizar(self, flor):
        return f"{self.nome} está polinizando a flor {flor}."
    
class Morcego(Ave):
    def voar(self):
        return f"{self.nome} está planando pelo ar!"
    
    def caçar_inseto(self):
        return f"{self.nome} está caçando insetos."

if __name__ == '__main__':
    # Cria um objeto de cada classe
    animal = Animal("Animal")
    ave = Ave("Pombo")
    inseto = Inseto("Abelha")
    morcego = Morcego("Batman")

    # Chama os métodos em cada objeto
    print(animal.comer("ração"))
    print(ave.construir_ninho())
    print(ave.voar())
    print(inseto.voar())
    print(inseto.polinizar("rosa"))
    print(morcego.voar())
    print(morcego.caçar_inseto())
    print(morcego.comer("caco de vidro"))