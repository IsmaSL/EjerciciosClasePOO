# Clase derivada que heredará de Producto

from producto import Producto

# La clase Ropa hereda de Producto
class Ropa(Producto):
    """Representa un artículo de ropa, que es un tipo de Producto."""
    def __init__(self, sku, nombre, precio, talla):
        # Llamamos al constructor de la clase padre (Producto)
        super().__init__(sku, nombre, precio)
        self.talla = talla

    # Sobrescribimos el método 'mostrar_info' para añadir la talla (Polimorfismo)
    def mostrar_info(self):
        """Muestra la información del producto ropa, incluyendo la talla"""
        info_base = super().mostrar_info()
        return f"{info_base}, Talla: {self.talla}"