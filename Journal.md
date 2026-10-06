# Phase 1

I overrode equals so artifacts with the same ID are treated as the same artifact even if their names or eras are different. This allows the collection to search using an artifact that only has the ID. The swap-with-last removal is faster because it avoids shifting every element after the removed item.
