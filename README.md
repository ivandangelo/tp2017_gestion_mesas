## Trabajo Práctico Nro 2

### Enunciado:
Un cliente nos solicitó el desarrollo de un sistema para administrar las ventas que se realizan en
un bar, donde se sirven comidas rápidas y bebidas.
Del análisis funcional de los requerimientos del cliente se llegó a las siguientes especificaciones.

## Módulo de gestión de mesas:
Este módulo se encargará de registrar todas las consumiciones que se realizan en una mesa del
bar. La cantidad de mesas con las que cuenta el bar se define con un parámetro del sistema.
Cada mesa se identifica con un número entero. Una mesa tiene un número, un estado y la lista de
consumiciones de los clientes que la están ocupando (si la mesa está disponible esta lista estará
vacía).


Las funcionalidades de este módulo son:
● ocupar una mesa
● cerrar una mesa
● pasar una mesa a estado disponible
● registrar consumición

Las mesas pueden tener los siguientes estados:
● **disponible** : Lista para recibir clientes. En este estado nunca puede tener consumiciones,
ni se pueden agregar nuevas consumiciones. Siempre puede pasar a los estados ocupada
o cerrada.
● **cerrada** : mesa que no puede ocuparse (porque está rota o porque no se va a usar). En
este estado nunca puede tener consumiciones, ni se pueden agregar nuevas
consumiciones. Siempre puede pasar a disponible.
● **ocupada** : mesa con clientes a la que se le puede agregar consumiciones. Pasa a
disponible cuando los clientes pagan o si deciden irse sin haber consumido nada. Solo
puede pasar a disponible, pero siempre que no tenga consumiciones.

![](C:\Users\ivaance\Desktop\v.png)
