# UrfuJava

Домашка по лекции 2:
Изучить параметры которые предоставляет аннотация @SpringBootApplication


Свойства аннотации @SpringBootApplication
exclude - Предоставленный массив классов, эти классы будут исключены из сканирования пакета Spring, заменяя любое включение, которое может случайно произойти из параметров scanBasePackages и scanBasePackageClasses.
excludeNames - Позволяет исключать классы по имени (String), работая аналогично параметру scanBasePackages.
scanBasePackages - Принимает строковый массив и позволяет фильтровать подстановочные знаки для имен пакетов, тем самым позволяя включать или сканировать целые каталоги пакетов.
scanBasePackageClasses - Позволяет конкретное включение классов, предоставляемых через массив.
nameGenerator BeanNameGenerator
proxyBeanMethods

