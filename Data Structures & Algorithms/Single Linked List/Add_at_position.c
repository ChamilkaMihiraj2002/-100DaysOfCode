#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node * link;
};

void add_to_end(struct node *, int);
void add_to_position(struct node *, int, int);
void display(struct node *);

int main() {
    struct node * head = (struct node *) malloc (sizeof(struct node));
    head->data = 50;
    head->link = NULL;

    printf("Main linked list :: ");
    display(head);

    add_to_end(head,60);
    add_to_end(head,70);
    add_to_end(head,85);
    printf("\nMain linked list after add nodes to end :: ");
    display(head);

    add_to_position(head,25,3);
    printf("\nUpdated Main linked list :: ");
    display(head);

    return 0;
}

void add_to_end(struct node * head, int data) {
    struct node * ptr = head;
    struct node * temp = (struct node *) malloc (sizeof(struct node));

    temp->data = data;
    temp->link = NULL;

    while (ptr->link != NULL)
    {
        ptr = ptr->link;
    }
    
    ptr->link = temp;
}


void add_to_position(struct node * head, int data, int position) {
    struct node * ptr = head;
    struct node * ptr2 = (struct node *) malloc (sizeof(struct node));

    ptr2->data = data;
    ptr2->link = NULL;

    position--;
    while (position != 1)
    {
        ptr = ptr->link;
        position--;
    }

    ptr2->link = ptr->link;
    ptr->link = ptr2;
}

void display(struct node * head) {
    struct node * ptr = head;
    while(ptr != NULL) {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
}