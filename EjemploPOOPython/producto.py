# Contendrá la clase base Producto

class Producto:
    """
    Representa un producto genérico en la tienda.
    Utilizar encapsulamiento para proteger el precio.
    """
    def __init__(self, sku, nombre, precio):
        self._sku = sku         # Atributo protegido
        self.nombre = nombre    # Atributo publico (o sin restricción)
        self.__precio = precio  # Atributo privado

    # Método para obtener el precio (getter)
    def get_precio(self):
        """Devuelve el precio del producto."""
        return self.__precio
    
    # Método para mostrar la información del producto (lo usaremos para Polimorfismo)
    def mostrar_info(self):
        """Muestra la información básica del producto."""
        return f"SKU: {self._sku}, Nombre: {self.nombre}, Precio: {self.get_precio()}"