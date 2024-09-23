#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node * link;
};

void count_of_node(struct node *);
void display(struct node *);
struct node * add_begin(struct node **, int);

int main() {
    struct node *  head = (struct node *) malloc (sizeof(struct node));
    head->data = 45;
    head->link = NULL;

    struct node *  current = (struct node *) malloc (sizeof(struct node));
    current->data = 50;
    current->link = NULL;

    head->link = current;
    
    current = (struct node *) malloc (sizeof(struct node));
    current->data = 75;
    current->link = NULL;

    head->link->link = current;

    printf("Original Linked List ::");
    count_of_node(head);
    display(head);

    // Add start
    add_begin(&head, 1000);

    printf("\nUpade Linked List ::");
    count_of_node(head);
    display(head);

    return 0;
}

void count_of_node(struct node * head) {
    int count = 0;
    if (head == NULL){  printf("Linked list is Empty!!\n"); }

    // create a pointer
    struct node * ptr = NULL;
    ptr = head;

    while (ptr != NULL)
    {
        count++;
        ptr = ptr->link;
    }
    printf("\nCount of Node :: %d\n", count);
}

void display(struct node * head) {
    if (head == NULL){  printf("Linked list is Empty!!\n"); }

    // Craete a pointer
    struct node * ptr = head;

    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    
}

struct node * add_begin(struct node ** head, int data) {
    struct node * ptr = (struct node *) malloc (sizeof(struct node));
    ptr->data = data;
    ptr->link = NULL;

    ptr->link = *head;
    *head = ptr;
}