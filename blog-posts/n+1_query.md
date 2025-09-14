
# Optimizing JPA Performance: Resolving N+1 Query Problem

## Overview

The **N+1 query problem** is a common performance issue in JPA/Hibernate. It occurs when fetching a parent entity causes additional queries for each associated child entity, leading to inefficient database access.

---

## Entities Setup

Two entities are used to replicate the problem:

- **Customer**
- **Device**

### Relationship

- A **Customer** has a **one-to-many** relationship with **Devices**.
- Annotated using `@OneToMany` in the `Customer` entity.

```java
@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<Device> devices;
```

---

## Cascade and Fetch Strategy

- **CascadeType.ALL**:  
  Ensures that saving a `Customer` also saves associated `Device` records.

- **FetchType.EAGER**:  
  Tells Hibernate to retrieve `Device` records **immediately** when querying `Customer`.

---

## The N+1 Query Problem

When executing a query like:

```java
repository.findAll();
```

Hibernate performs:

1. **1 query** to fetch all `Customer` records.
2. **N queries** (one for each `Customer`) to fetch associated `Device` records.

### Resulting Issue

This leads to **N+1 total queries**, which can severely impact performance, especially with large datasets.

---

## Next Steps

To resolve this issue, consider:

- Using **`FetchType.LAZY`** instead of `EAGER`.
- Applying **`@EntityGraph`** or **`JOIN FETCH`** in JPQL to optimize fetching.
- Leveraging **batch fetching** or **second-level caching**.
