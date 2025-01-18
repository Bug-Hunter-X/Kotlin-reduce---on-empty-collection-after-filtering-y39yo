# Kotlin reduce() Exception with Empty Collection
This example demonstrates a common error in Kotlin when using the `reduce()` function on a collection that might be empty after applying intermediate operations like `filter()` or `map()`. The `reduce()` function requires at least one element in the collection; otherwise, it throws an `UnsupportedOperationException`.