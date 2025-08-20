# Ejemplificación de la Composición y Agregación

class CarritoCompra:
    """
    Representar el carrito de compras de un cliente (Composición).
    Contiene una lista de Productos (Agregación).
    """
    def __init__(self):
        self.__productos = []       # Lista para almacenar los productos

    def agregar_productos(self, producto):
        """Añade un producto al carrito"""
        self.__productos.append(producto)
        print(f"'{producto.nombre}' ha sido agregado con éxito al carrito.")

    def calcular_total(self):
        """
        Calcula el total de la compra sumando el precio de cada producto.
        Aquí se manifiesta el Polimorfismo.
        """
        total = 0
        for producto in self.__productos:
            # No importa si es Ropa o Electrónico, ambos tienen get_precio()
            total += producto.get_precio()

        return total
    
    def mostrar_carrito(self):
        """Muestra todos los productos del carrito."""
        print("------------ Contenido del carrito ------------")
        if not self.__productos:
            print("El carrito está vacío.")
        else:
            for producto in self.__productos:
                print(f"- {producto.mostrar_info()}")
        print("-----------------------------------------------")


class Cliente:
    """
    Representa a un cliente de la tienda.
    El cliente tiene un CarritoCompra (Composición).
    """
    def __init__(self, nombre):
        self.nombre = nombre
        self.carrito = CarritoCompra()