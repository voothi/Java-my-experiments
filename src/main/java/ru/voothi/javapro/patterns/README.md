Vladimir Vysokomornyi - Шаблоны проектирования Java
---
- Плейлист 
https://www.youtube.com/playlist?list=PLwcDaxeEINactCC4mly7RQon5juIpH-Q3

### Шаблоны Java. Фабричный метод (Factory Method)
- https://www.youtube.com/watch?v=HZ4ciLNWX4E&t=185s
  - ru/voothi/javapro/patterns/factorymethod
  - по мотивам комментария  
https://github.com/ananserr/EPAM_PatternsFromVideos  
ru/voothi/epam/patterns/factorymethod
- мой комментарий

        Тоже заметил на 3:23 про "наследование" вмето "реализация". 
        
        Здесь понятно, что класс ConcreteCreator
         реализует интерфейс Creator и т.д. там, где пунктирная стрелка.
        
        Отношения между классами:
        - при наследовании классов и реализации интерфейсов  - IS-A (является), но есть уточнение, что в случае реализации интефрейсов - это скорее IS..., т.к. интерфейсы позволяют описать т.н. протокол, где говориться "Что", а не "Как".
        - при ассоциации, агрегации и композиции - HAS-A (является частью)
        
        Если я где-то не точен, ответьте мне - интересно.
        - - -
        наследование == extends, inheritance
        отношение == relationships
        реализует, расширяет == implements
        контракт, протокол == contract, protocol
        https://www.examclouds.com/ru/java/java-core-russian/class-relations
        https://stackoverflow.com/questions/35962451/what-kind-of-relationship-does-an-interface-have-with-it-implementing-class
        
### Шаблоны Java. Абстрактная фабрика (Abstract Factory)
- https://www.youtube.com/watch?v=FYX9l5OQtJE

