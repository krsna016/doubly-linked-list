# Data Structures & Algorithms (DSA): Doubly Linked List

[![Language: Java](https://img.shields.io/badge/Language-Java_11-ED8B00?logo=java&style=flat-square)]()
[![Architecture: OOP](https://img.shields.io/badge/Architecture-Object_Oriented-0052CC?style=flat-square)]()
[![Maintenance: Archived/Educational](https://img.shields.io/badge/Maintenance-Educational-blue.svg?style=flat-square)]()

## Overview
This repository functions as a highly granular, enterprise-grade Java implementation of the fundamental Doubly Linked List data structure. Building upon the Singly Linked List, it introduces dual-memory pointer arithmetic (Next and Previous) to enable $O(1)$ reverse-traversal and tail-end deletion mechanics, serving as a pristine reference architecture for advanced technical engineering.

## Problem Statement
Standard Singly Linked Lists suffer from $O(N)$ linear time complexity when deleting nodes from the tail, as the entire list must be traversed to update the penultimate node's pointer. When system architectures demand high-frequency, bidirectional data ingestion (e.g., Browser History, LRU Caches), relying on single-pointer memory traversal creates unacceptable performance bottlenecks. This repository solves that by exposing the raw Object-Oriented blueprint for a bi-directional Doubly Linked List.

## Key Features
- **Bi-Directional Memory Mechanics:** Explicit generic `Node<T>` classes implementing dual `next` and `previous` memory pointers.
- **Strict OOP Abstractions:** Decouples the Abstract Data Type (ADT) interface from the concrete `DoublyLinkedList` implementation.
- **$O(1)$ Head/Tail Operations:** Architected with optimal constant-time complexity for both insertion and deletion at both ends of the memory chain.
- **Isolated Package Structure:** Divided into specific Java subpackages (`adt/`, `node/`, `list/`) to emulate enterprise build environments.

## Architecture

```mermaid
graph LR
    ADT[Abstract Data Type Interface] -->|Implements| DLL[DoublyLinkedList Class]
    DLL -->|Manages| Head[Head Pointer]
    DLL -->|Manages| Tail[Tail Pointer]
    
    Head --> Node1
    Node1 <-->|Next / Prev| Node2
    Node2 <-->|Next / Prev| NodeN
    NodeN --> Tail
```

## Technology Stack
- **Language:** Java (JDK 11+)
- **Testing:** Python `unittest` (Javac Wrapper)
- **Documentation:** GitHub Flavored Markdown (GFM)

## Project Structure
```text
doubly-linked-list/
├── src/
│   ├── adt/                 # Core Interface contracts
│   ├── node/                # Generic Node payload & dual-pointer logic
│   ├── list/                # Concrete Doubly Linked List implementation
│   └── main/                # Application drivers
├── tests/                   # Automated compilation verification
└── README.md                # System documentation
```

## Installation
Ensure the Java Development Kit (JDK) is installed natively on your OS.
```bash
git clone https://github.com/krsna016/doubly-linked-list.git
cd doubly-linked-list/src
```

## Usage
Compile and execute the specific driver class directly, mapping the sourcepath to resolve cross-package dependencies:
```bash
javac -sourcepath . main/Main.java
java main.Main
```

## Examples
*Example interface mapping for constant-time complexity implementations:*
```java
package adt;

public interface LinkedListADT<T> {
    // O(1) time complexity requirement
    void insertAtHead(T data);
    
    // O(1) time complexity requirement (Upgraded from Singly Linked List)
    void deleteFromTail();
}
```

## Screenshots
> [!NOTE]
> *Educational algorithms execute via standard terminal output without GUI interactions.*

## Visual Demonstrations
> [!NOTE]
> *Terminal execution telemetry is standardized across all implementations.*

## Testing
We utilize a dynamic Python subprocess wrapper to programmatically test `javac` compilation across all Java packages concurrently. This ensures that the deep package-level inheritance and interface contracts compile cleanly without missing dependencies.
```bash
python3 -m unittest discover tests/
```

## Performance Notes
- **Space Complexity Tradeoffs:** While a Doubly Linked List achieves $O(1)$ tail-deletion, it sacrifices memory efficiency, as the secondary `previous` pointer requires an additional 8 bytes (on 64-bit JVMs) of overhead per node. 

## Future Improvements
- **Maven/Gradle Integration:** Refactor the repository to utilize a standard `pom.xml` or `build.gradle` file, allowing native integration of JUnit 5 testing frameworks rather than relying on subprocess wrappers.
- **LRU Cache Implementation:** Extend the data structure to build a fully functional Least Recently Used (LRU) Cache, combining a `HashMap` with this Doubly Linked List.

## Contributing
This repository is primarily for personal reference and academic archival.

## License
Licensed under the MIT License.
