# Importar todas las clases que hemos creado
from tienda import Tienda
from venta import Cliente
from ropa import Ropa
from electronica import Electronica

# 1. Configuración inicial
# Creamos la tienda
mi_tienda = Tienda("Patito")

# Crear algunos productos de diferentes tipos
camisa = Ropa("R001", "Camisa de Lino", 450.00, "M")
laptop = Electronica("E001", "Laptop Gamer", 25000.00, 24)
jeans = Ropa("R002", "Pantalón Mezclilla", 700.00, "32")
smart_tv = Electronica("E002", "Smart TV 55 pulgadas", 5000.00, 12)

# Mostramos el inventario disponible (vacío)
mi_tienda.mostrar_inventario()

# Agregar los productos al inventario de la tienda
mi_tienda.agregar_producto_inventario(camisa)
mi_tienda.agregar_producto_inventario(laptop)
mi_tienda.agregar_producto_inventario(jeans)
mi_tienda.agregar_producto_inventario(smart_tv)

# Mostramos el inventario disponible (con productos)
mi_tienda.mostrar_inventario()

# 2. Simulación de la compra
cliente = Cliente("Joaquín López")
cliente.carrito.agregar_productos(camisa)
cliente.carrito.agregar_productos(smart_tv)

# El cliente decide ver que tiene su carrito
cliente.carrito.mostrar_carrito()

# 3. Finalizar la venta
# La tienda procesa la venta del cliente
mi_tienda.realizar_venta(cliente)