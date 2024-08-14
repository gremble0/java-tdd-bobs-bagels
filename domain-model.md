## Domain model Basket class
- NOTE: Bagel is an enum

| Variables | Methods                             | Scenario               | Output |
|-----------|-------------------------------------|------------------------|--------|
|           | `boolean add(Bagel bagel)`          | Basket is full         | false  |
|           |                                     | Basket is not full     | true   |
|           | `boolean remove(Bagel bagel)`       | Bagel is not in basket | false  |
|           |                                     | Bagel is in basket     | true   |
|           | `boolean isFull()`                  |                        |        |
|           | `void setCapacity(int newCapacity)` |                        |        |
