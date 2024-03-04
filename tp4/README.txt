
matchers (comparateur): sont des methodes, qui sont des parametres dans les assertions
syntaxe:
assertThat( <some_matcher> );
some matchers: the junit4 matcher and their aquevilant in junit 5

1. - JUnit 4: `assertEquals()`
   - JUnit 5: `assertEquals()`

2. **Tester si toutes les conditions sont satisfaites**:
   - JUnit 4: `allOf()`
   - JUnit 5: `assertAll()`

3. **Tester si l’une des conditions est satisfaite**:
   - JUnit 4: `anyOf()`
   - JUnit 5: `assertAny()`

4. **Tester le type de l’objet**:
   - JUnit 4: `instanceOf()`
   - JUnit 5: `assertInstanceOf()`

5. **Tester la référence de l’objet**:
   - JUnit 4: `sameInstance()`
   - JUnit 5: `assertSame()`

6. **Tester si la valeur est proche à une valeur donnée**:
   - JUnit 4: `closeTo()`
   - JUnit 5: `assertThat(actual, closeTo(expected, delta))`

7. **Tester des comparaisons**:
   - JUnit 4: `greaterThan()`, `greaterThanOrEqualTo()`, `lessThan()`, `lessThanOrEqualTo()`
   - JUnit 5: Use combination of `assertThat()` and matchers like `greaterThan()`, `greaterThanOrEqualTo()`, `lessThan()`, `lessThanOrEqualTo()` from `org.hamcrest.Matchers`

8. **Tester si le Map contient une entrée, une clé ou une valeur**:
   - JUnit 4: `hasEntry()`, `hasKey()`, `hasValue()`
   - JUnit 5: No direct equivalent. You might need to perform assertions on the map itself.

9. **Tester l’égalité des chaines des caractères**:
   - JUnit 4: `containsString()`, `endsWith()`, `startsWith()`
   - JUnit 5: `assertThat(actual, containsString(expected))`, `assertThat(actual, endsWith(expected))`, `assertThat(actual, startsWith(expected))`

10. **Tester si une collection ou un tableau contient des éléments**:
    - JUnit 4: `hasItem()`, `hasItems()`, `hasItemInArray()`
    - JUnit 5: `assertThat(collection/array, hasItem(expected))`, `assertThat(collection/array, hasItems(expected1, expected2, ...))`, `assertThat(array, hasItemInArray(expected))`
