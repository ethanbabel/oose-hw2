## Faculty and Department

- The relationship is aggregation.
- The open diamond near `Department` means that a department is a group of faculty members, but the faculty can still exist independently of the department. 
- The `*` near `Faculty` means one department can be associated with many (any number of) faculty members. 
- The arrow points toward `Faculty`, which shows navigability from `Department` to `Faculty`.

## AlarmController and Sensor

- The relationship is association.
- The line between `AlarmController` and `Sensor` shows that the two classes are connected. 
- The `1` near `AlarmController` means each sensor is associated with exactly one alarm controller. 
- The `1..*` near `Sensor` means one alarm controller is associated with one or more sensors. 
- There is no arrow, so the diagram does not show a specific navigability direction.
