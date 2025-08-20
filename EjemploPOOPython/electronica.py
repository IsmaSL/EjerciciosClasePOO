# Clase derivada que heredará de Producto

from producto import Producto

# La clase Electrónica hereda de Producto
class Electronica(Producto):
    """Representa un artículo de electronica, que es un tipo de Producto."""
    def __init__(self, sku, nombre, precio, garantia_meses):
        # Llamamos al constructor de la clase padre (Producto)
        super().__init__(sku, nombre, precio)
        self.garantia_meses = garantia_meses

    # Sobrescribimos el método 'mostrar_info' para añadir la inf. garantía (Polimorfismo)
    def mostrar_info(self):
        """Muestra la información del producto electrónico, incluyendo la garantía"""
        info_base = super().mostrar_info()
        return f"{info_base}, Garantía: {self.garantia_meses} meses."