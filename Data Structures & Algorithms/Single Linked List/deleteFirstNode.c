#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node * link;
};

void count_of_node(struct node *);
void display(struct node *);
struct node * del_first(struct node *);

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

    count_of_node(head);
    display(head);

    head = del_first(head);

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
    printf("Count of Node :: %d\n", count);
}

void display(struct node * head) {
    if (head == NULL){  printf("Linked list is Empty!!\n"); }

    // Create a pointer
    struct node * ptr = head;

    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");
}

struct node * del_first(struct node * head) {
    if (head == NULL)
    {
        printf("Linked List is Empty!!");
    } else {
        struct node * temp = head;
        head = head->link;
        free(temp);
    }
    return head;
}