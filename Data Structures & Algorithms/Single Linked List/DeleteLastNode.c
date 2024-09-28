#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node * link;
};

void count_of_node(struct node *);
void display(struct node *);
struct node * del_last(struct node *);

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

    head = del_last(head);

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

    // Craete a pointer
    struct node * ptr = head;

    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");
}

struct node * del_last(struct node * head) {
    if (head == NULL){
        printf("Linked List is Empty!!");
    } else if (head->link == NULL) {
        free(head);
        head = NULL;
    } else {
        struct node * temp = head;
        struct node * temp1 = head;

        while (temp->link != NULL)
        {
            temp1 = temp;
            temp = temp->link;
        }
        temp1->link = NULL;
        free(temp);
        temp = NULL;
    }
    return head;
}