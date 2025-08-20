class Tienda:
    """
    Gestiona el inventario de Productos y el proceso de la Venta
    """
    def __init__(self, nombre):
        self.nombre = nombre
        self.__inventario = []  # Lista de productos disponibles

    def agregar_producto_inventario(self, producto):
        """Añade un producto al inventario de la tienda"""
        self.__inventario.append(producto)
        print(f"Producto '{producto.nombre}' agregado al inventario de {self.nombre}.")

    def mostrar_inventario(self):
        """Muestra los productos disponibles en la tienda."""
        print(f"------------ Inventario de {self.nombre} ------------")
        if not self.__inventario:
            print("El inventario está vacío.")
        else:
            for producto in self.__inventario:
                print(f"- {producto.mostrar_info()}")
        print("-----------------------------------------------")

    def realizar_venta(self, cliente):
        """Simula el proceso de venta para un cliente."""
        print(f"\n===== Iniciando Venta parta {cliente.nombre} =====")
        cliente.carrito.mostrar_carrito()
        total = cliente.carrito.calcular_total()
        print(f"El total de la compra es: ${total:.2f}")
        print("Gracias por su compra!")
        print("-----------------------------------------------")